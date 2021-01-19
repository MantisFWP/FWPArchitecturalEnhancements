
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockBrickPaintedGreen;
import net.mcreator.fwparchitecturalenhancements.block.BlockBrickPaintedDarkGreen;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeBrickPaintedDarkGreenCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeBrickPaintedDarkGreenCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1175);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBrickPaintedGreen.block, (int) (1)), new ItemStack(BlockBrickPaintedDarkGreen.block, (int) (1)),
				1F);
	}
}
