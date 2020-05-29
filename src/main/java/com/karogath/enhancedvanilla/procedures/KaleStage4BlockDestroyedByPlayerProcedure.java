package com.karogath.enhancedvanilla.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import com.karogath.enhancedvanilla.item.KaleSeedsItem;
import com.karogath.enhancedvanilla.item.KaleItem;
import com.karogath.enhancedvanilla.EnhancedvanillaModVariables;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class KaleStage4BlockDestroyedByPlayerProcedure extends EnhancedvanillaModElements.ModElement {
	public KaleStage4BlockDestroyedByPlayerProcedure(EnhancedvanillaModElements instance) {
		super(instance, 311);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KaleStage4BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure KaleStage4BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure KaleStage4BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure KaleStage4BlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure KaleStage4BlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double dropChance = 0;
		dropChance = (double) Math.random();
		if (!world.isRemote) {
			ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(KaleItem.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.addEntity(entityToSpawn);
		}
		if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
			if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.965)) {
				for (int index0 = 0; index0 < (int) (6); index0++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.813)) {
				for (int index1 = 0; index1 < (int) (5); index1++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.574)) {
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.405)) {
				for (int index3 = 0; index3 < (int) (3); index3++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.338)) {
				for (int index4 = 0; index4 < (int) (2); index4++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.322)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
			if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.939)) {
				for (int index5 = 0; index5 < (int) (5); index5++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.724)) {
				for (int index6 = 0; index6 < (int) (4); index6++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.476)) {
				for (int index7 = 0; index7 < (int) (3); index7++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.353)) {
				for (int index8 = 0; index8 < (int) (2); index8++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.319)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
			if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.893)) {
				for (int index9 = 0; index9 < (int) (4); index9++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.607)) {
				for (int index10 = 0; index10 < (int) (3); index10++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.388)) {
				for (int index11 = 0; index11 < (int) (2); index11++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.319)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else {
			if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.813)) {
				for (int index12 = 0; index12 < (int) (3); index12++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.471)) {
				for (int index13 = 0; index13 < (int) (2); index13++) {
					if (!world.isRemote) {
						ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(KaleSeedsItem.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.addEntity(entityToSpawn);
					}
				}
			} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.323)) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
