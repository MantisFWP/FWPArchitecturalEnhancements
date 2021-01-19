
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockRandomBrickSandstone;
import net.mcreator.fwparchitecturalenhancements.block.BlockRandomBrickEarth;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeRandomEarthBrickCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeRandomEarthBrickCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1141);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRandomBrickSandstone.block, (int) (1)), new ItemStack(BlockRandomBrickEarth.block, (int) (1)),
				2F);
	}
}
