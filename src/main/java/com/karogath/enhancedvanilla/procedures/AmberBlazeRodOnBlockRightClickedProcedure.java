package com.karogath.enhancedvanilla.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import com.karogath.enhancedvanilla.block.AmberBlock;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class AmberBlazeRodOnBlockRightClickedProcedure extends EnhancedvanillaModElements.ModElement {
	public AmberBlazeRodOnBlockRightClickedProcedure(EnhancedvanillaModElements instance) {
		super(instance, 334);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmberBlazeRodOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AmberBlazeRodOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AmberBlazeRodOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AmberBlazeRodOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AmberBlazeRodOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AmberBlock.block.getDefaultState(), 3);
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(Items.BLAZE_ROD, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
