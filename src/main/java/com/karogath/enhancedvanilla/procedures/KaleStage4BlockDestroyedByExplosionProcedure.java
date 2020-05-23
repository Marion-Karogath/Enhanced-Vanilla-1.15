package com.karogath.enhancedvanilla.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import com.karogath.enhancedvanilla.item.KaleSeedsItem;
import com.karogath.enhancedvanilla.item.KaleItem;
import com.karogath.enhancedvanilla.EnhancedvanillaModVariables;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class KaleStage4BlockDestroyedByExplosionProcedure extends EnhancedvanillaModElements.ModElement {
	public KaleStage4BlockDestroyedByExplosionProcedure(EnhancedvanillaModElements instance) {
		super(instance, 302);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure KaleStage4BlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure KaleStage4BlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure KaleStage4BlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure KaleStage4BlockDestroyedByExplosion!");
			return;
		}
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
		if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.813)) {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.471)) {
			for (int index1 = 0; index1 < (int) (2); index1++) {
				if (!world.isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(KaleSeedsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if (((EnhancedvanillaModVariables.WorldVariables.get(world).cropsGrowthTimer) >= 0.323)) {
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, (x + 0.5), (y + 0.5), (z + 0.5), new ItemStack(KaleSeedsItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
