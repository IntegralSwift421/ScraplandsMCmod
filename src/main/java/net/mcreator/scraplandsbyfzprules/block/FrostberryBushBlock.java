
package net.mcreator.scraplandsbyfzprules.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.scraplandsbyfzprules.procedures.FrostberryGrowthProcedure;
import net.mcreator.scraplandsbyfzprules.procedures.FrostberryBushBerrySpawnProcedure;
import net.mcreator.scraplandsbyfzprules.init.HardToFindBiomesByFzprulesModBlocks;

import java.util.Random;

public class FrostberryBushBlock extends FlowerBlock {
	public FrostberryBushBlock() {
		super(MobEffects.HARM, 100,
				BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.GRASS).strength(0.4f, 0f).noDrops().noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public BlockBehaviour.OffsetType getOffsetType() {
		return BlockBehaviour.OffsetType.NONE;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.ICE) || groundState.is(Blocks.PACKED_ICE) || groundState.is(Blocks.FROSTED_ICE)
				|| groundState.is(Blocks.BLUE_ICE)

		;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		FrostberryGrowthProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		FrostberryBushBerrySpawnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return InteractionResult.SUCCESS;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(HardToFindBiomesByFzprulesModBlocks.FROSTBERRY_BUSH.get(),
				renderType -> renderType == RenderType.cutout());
	}
}
