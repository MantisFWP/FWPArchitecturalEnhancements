
package net.mcreator.fwparchitecturalenhancements.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.mcreator.fwparchitecturalenhancements.ElementsFwparchitecturalenhancementsMod;

@ElementsFwparchitecturalenhancementsMod.ModElement.Tag
public class BlockValentinesDayWallPaperRed1 extends ElementsFwparchitecturalenhancementsMod.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:valentines_day_wall_paper_red_1")
	public static final Block block = null;
	public BlockValentinesDayWallPaperRed1(ElementsFwparchitecturalenhancementsMod instance) {
		super(instance, 1260);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("valentines_day_wall_paper_red_1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:valentines_day_wall_paper_red_1", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("valentines_day_wall_paper_red_1");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.tab);
		}
	}
}
