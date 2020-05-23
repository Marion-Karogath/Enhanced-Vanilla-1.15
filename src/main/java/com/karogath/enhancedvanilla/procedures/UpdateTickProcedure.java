package com.karogath.enhancedvanilla.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import com.karogath.enhancedvanilla.block.KaleStage4Block;
import com.karogath.enhancedvanilla.block.KaleStage3Block;
import com.karogath.enhancedvanilla.block.KaleStage2Block;
import com.karogath.enhancedvanilla.block.KaleStage1Block;
import com.karogath.enhancedvanilla.block.KaleStage0Block;
import com.karogath.enhancedvanilla.EnhancedvanillaModVariables;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class UpdateTickProcedure extends EnhancedvanillaModElements.ModElement {
	public UpdateTickProcedure(EnhancedvanillaModElements instance) {
		super(instance, 303);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomGrowth = 0;
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock()))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage0Block.block.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage1Block.block.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage2Block.block.getDefaultState()
									.getBlock())
									|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage3Block.block
											.getDefaultState().getBlock()))))) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", (int) (x));
					$_dependencies.put("y", (int) (y));
					$_dependencies.put("z", (int) (z));
					KaleBlockDestroyedByExplosionProcedure.executeProcedure($_dependencies);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage4Block.block.getDefaultState()
					.getBlock())) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", (int) (x));
					$_dependencies.put("y", (int) (y));
					$_dependencies.put("z", (int) (z));
					KaleStage4BlockDestroyedByExplosionProcedure.executeProcedure($_dependencies);
				}
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SAND.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.RED_SAND.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRAVEL.getDefaultState().getBlock())
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.ANVIL.getDefaultState()
								.getBlock())
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CHIPPED_ANVIL
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.DAMAGED_ANVIL
												.getDefaultState().getBlock())))
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER
										.getDefaultState().getBlock())
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
												.getBlock() == Blocks.ORANGE_CONCRETE_POWDER.getDefaultState().getBlock())
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
														.getBlock() == Blocks.MAGENTA_CONCRETE_POWDER.getDefaultState().getBlock())
														|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																.getBlock() == Blocks.LIGHT_BLUE_CONCRETE_POWDER.getDefaultState().getBlock())
																|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																		.getBlock() == Blocks.YELLOW_CONCRETE_POWDER.getDefaultState().getBlock())
																		|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																				.getBlock() == Blocks.LIME_CONCRETE_POWDER.getDefaultState()
																						.getBlock())
																				|| (((world
																						.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																								.getBlock() == Blocks.PINK_CONCRETE_POWDER
																										.getDefaultState().getBlock())
																						|| (((world.getBlockState(
																								new BlockPos((int) x, (int) (y + 1), (int) z)))
																										.getBlock() == Blocks.GRAY_CONCRETE_POWDER
																												.getDefaultState().getBlock())
																								|| (((world.getBlockState(new BlockPos((int) x,
																										(int) (y + 1), (int) z)))
																												.getBlock() == Blocks.LIGHT_GRAY_CONCRETE_POWDER
																														.getDefaultState().getBlock())
																										|| (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 1), (int) z)))
																														.getBlock() == Blocks.CYAN_CONCRETE_POWDER
																																.getDefaultState()
																																.getBlock())
																												|| (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 1),
																																(int) z)))
																																		.getBlock() == Blocks.PURPLE_CONCRETE_POWDER
																																				.getDefaultState()
																																				.getBlock())
																														|| (((world.getBlockState(
																																new BlockPos((int) x,
																																		(int) (y + 1),
																																		(int) z)))
																																				.getBlock() == Blocks.BLUE_CONCRETE_POWDER
																																						.getDefaultState()
																																						.getBlock())
																																|| (((world
																																		.getBlockState(
																																				new BlockPos(
																																						(int) x,
																																						(int) (y + 1),
																																						(int) z)))
																																								.getBlock() == Blocks.BROWN_CONCRETE_POWDER
																																										.getDefaultState()
																																										.getBlock())
																																		|| (((world
																																				.getBlockState(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y + 1),
																																								(int) z)))
																																										.getBlock() == Blocks.GREEN_CONCRETE_POWDER
																																												.getDefaultState()
																																												.getBlock())
																																				|| (((world
																																						.getBlockState(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y + 1),
																																										(int) z)))
																																												.getBlock() == Blocks.RED_CONCRETE_POWDER
																																														.getDefaultState()
																																														.getBlock())
																																						|| ((world
																																								.getBlockState(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y + 1),
																																												(int) z)))
																																														.getBlock() == Blocks.BLACK_CONCRETE_POWDER
																																																.getDefaultState()
																																																.getBlock())))))))))))))))))))) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
		} else if (((!(world.isRemote)) && ((world.getLight(new BlockPos((int) x, (int) (y + 1), (int) z))) > 7))) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("growthTimer", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "growthTimer")) + 0.05));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "growthTimer")) >= 20)) {
				EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer = (double) Math.random();
				EnhancedvanillaModVariables.WorldVariables.get(world).syncData(world);
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage0Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage2Block.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage1Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage1Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage3Block.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage2Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage2Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage4Block.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage3Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == KaleStage3Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), KaleStage4Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
