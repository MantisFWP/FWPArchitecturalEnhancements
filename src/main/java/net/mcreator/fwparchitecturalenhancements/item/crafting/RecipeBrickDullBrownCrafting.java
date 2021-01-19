
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockBrickDullBrown;
import net.mcreator.fwparchitecturalenhancements.block.BlockBrickBrown;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeBrickDullBrownCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeBrickDullBrownCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1157);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBrickBrown.block, (int) (1)), new ItemStack(BlockBrickDullBrown.block, (int) (1)), 1F);
	}
}
