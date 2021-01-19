
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockBrickPaintedYellow;
import net.mcreator.fwparchitecturalenhancements.block.BlockBrickPaintedDarkYellow;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeBrickPaintedDarkYellowCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeBrickPaintedDarkYellowCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1173);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBrickPaintedYellow.block, (int) (1)), new ItemStack(BlockBrickPaintedDarkYellow.block, (int) (1)),
				1F);
	}
}
