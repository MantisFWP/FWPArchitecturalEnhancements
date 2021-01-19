
package net.mcreator.fwparchitecturalenhancements.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.fwparchitecturalenhancements.block.BlockRandomBrickGray;
import net.mcreator.fwparchitecturalenhancements.block.BlockRandomBrickAsh;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class RecipeRandomAshBrickCrafting extends ElementsFwparchitecturalenhancementsMod.ModElement {
	public RecipeRandomAshBrickCrafting(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1142);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRandomBrickGray.block, (int) (1)), new ItemStack(BlockRandomBrickAsh.block, (int) (1)), 1F);
	}
}
