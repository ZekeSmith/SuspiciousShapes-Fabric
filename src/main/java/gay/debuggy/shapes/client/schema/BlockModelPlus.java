package gay.debuggy.shapes.client.schema;

import java.util.HashMap;

import net.minecraft.client.render.model.json.ModelTransformation;

public class BlockModelPlus {
	public String parent = null;
	public boolean ambientocclusion = true;
	public HashMap<String, String> textures = new HashMap<>();
	public ModelTransformation display = ModelTransformation.NONE;
	public int[] colorIndexes = null;
}
