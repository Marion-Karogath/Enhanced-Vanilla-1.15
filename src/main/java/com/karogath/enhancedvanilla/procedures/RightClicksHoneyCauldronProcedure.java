package com.karogath.enhancedvanilla.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import com.karogath.enhancedvanilla.block.HoneyCauldronLevel3Block;
import com.karogath.enhancedvanilla.block.HoneyCauldronLevel2Block;
import com.karogath.enhancedvanilla.block.HoneyCauldronLevel1Block;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class RightClicksHoneyCauldronProcedure extends EnhancedvanillaModElements.ModElement {
	public RightClicksHoneyCauldronProcedure(EnhancedvanillaModElements instance) {
		super(instance, 293);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RightClicksHoneyCauldron!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RightClicksHoneyCauldron!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RightClicksHoneyCauldron!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RightClicksHoneyCauldron!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RightClicksHoneyCauldron!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAULDRON.getDefaultState().getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.HONEY_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HoneyCauldronLevel1Block.block.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HoneyCauldronLevel1Block.block.getDefaultState()
				.getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.HONEY_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HoneyCauldronLevel2Block.block.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HoneyCauldronLevel2Block.block.getDefaultState()
				.getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.HONEY_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HoneyCauldronLevel3Block.block.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HoneyCauldronLevel3Block.block.getDefaultState()
				.getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.HONEY_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HoneyCauldronLevel2Block.block.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HoneyCauldronLevel2Block.block.getDefaultState()
				.getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.HONEY_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HoneyCauldronLevel1Block.block.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HoneyCauldronLevel1Block.block.getDefaultState()
				.getBlock())
				&& (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.HONEY_BOTTLE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAULDRON.getDefaultState(), 3);
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		PlayerEntity entity = event.getPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
