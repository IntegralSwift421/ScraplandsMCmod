
package net.mcreator.scraplandsbyfzprules.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.scraplandsbyfzprules.init.BattleOfTheRacesByFzprulesModBlocks;

import java.util.List;
import java.util.Collections;

public class FrostedStoneWallBlock extends WallBlock {
	public FrostedStoneWallBlock() {
		super(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.STONE).strength(1f, 10f).friction(0.7999999999999999f)
				.speedFactor(1.1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BattleOfTheRacesByFzprulesModBlocks.FROSTED_STONE_WALL.get(),
				renderType -> renderType == RenderType.cutout());
	}
}
