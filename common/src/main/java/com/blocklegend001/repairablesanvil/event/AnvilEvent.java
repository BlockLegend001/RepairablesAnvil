package com.blocklegend001.repairablesanvil.event;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class AnvilEvent {
    public static InteractionResult onAnvilUsage(UseOnContext context) {
        Player player = context.getPlayer();
        if (player == null || player.isCreative()) return InteractionResult.PASS;

        ItemStack stack = context.getItemInHand();
        BlockPos pos = context.getClickedPos();
        Level level = context.getLevel();
        BlockState state = level.getBlockState(pos);
        Block block = state.getBlock();

        if (stack.is(Items.IRON_INGOT)) {
            if (block.equals(Blocks.DAMAGED_ANVIL)) {
                level.setBlock(pos, Blocks.CHIPPED_ANVIL.defaultBlockState(), 3);
                level.playSound(null, pos, SoundEvents.ANVIL_PLACE, SoundSource.BLOCKS, 0.5F, 1.0F);
                stack.shrink(1);
                return InteractionResult.SUCCESS;
            } else if (block.equals(Blocks.CHIPPED_ANVIL)) {
                level.setBlock(pos, Blocks.ANVIL.defaultBlockState(), 3);
                level.playSound(null, pos, SoundEvents.ANVIL_PLACE, SoundSource.BLOCKS, 0.5F, 1.0F);
                stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
