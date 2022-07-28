import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("oe")
@Implements("ObjectNode")
public class ObjectNode extends Node {
	@ObfuscatedName("o")
	@Export("obj")
	public final Object obj;

	public ObjectNode(Object var1) {
		this.obj = var1;
	}
}