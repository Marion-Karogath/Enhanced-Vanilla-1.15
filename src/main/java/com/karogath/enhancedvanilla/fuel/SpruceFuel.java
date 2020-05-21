
package com.karogath.enhancedvanilla.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import com.karogath.enhancedvanilla.block.SpruceTanBarkBlock;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class SpruceFuel extends EnhancedvanillaModElements.ModElement {
	public SpruceFuel(EnhancedvanillaModElements instance) {
		super(instance, 197);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(SpruceTanBarkBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
