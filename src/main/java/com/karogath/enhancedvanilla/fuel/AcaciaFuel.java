
package com.karogath.enhancedvanilla.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import com.karogath.enhancedvanilla.block.AcaciaTanbarkBlock;
import com.karogath.enhancedvanilla.EnhancedvanillaModElements;

@EnhancedvanillaModElements.ModElement.Tag
public class AcaciaFuel extends EnhancedvanillaModElements.ModElement {
	public AcaciaFuel(EnhancedvanillaModElements instance) {
		super(instance, 211);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AcaciaTanbarkBlock.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
