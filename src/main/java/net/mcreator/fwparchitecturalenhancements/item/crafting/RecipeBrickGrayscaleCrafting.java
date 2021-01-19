
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockBrickWhite;
import net.mcreator.fwparchitecturalenhancements.block.BlockBrickGrayscale;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeBrickGrayscaleCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeBrickGrayscaleCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1150);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBrickWhite.block, (int) (1)), new ItemStack(BlockBrickGrayscale.block, (int) (1)), 1F);
	}
}
