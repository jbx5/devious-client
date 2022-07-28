import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gh")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lcq;")
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1605769727)
	@Export("approxDestinationX")
	public int approxDestinationX;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 2044245699)
	@Export("approxDestinationY")
	public int approxDestinationY;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 369039935)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1300151607)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIILgr;I)Z", garbageValue = "309597362")
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lfj;", garbageValue = "-1465953094")
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = ((KitDefinition) (KitDefinition.KitDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			KitDefinition.KitDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lku;I[B[BI)V", garbageValue = "-873901892")
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3445 == null) {
			if (var2 == null) {
				return;
			}
			var0.field3445 = new byte[11][];
			var0.field3446 = new byte[11][];
			var0.field3447 = new int[11];
			var0.field3448 = new int[11];
		}
		var0.field3445[var1] = var2;
		if (var2 != null) {
			var0.field3444 = true;
		} else {
			var0.field3444 = false;
			for (int var4 = 0; var4 < var0.field3445.length; ++var4) {
				if (var0.field3445[var4] != null) {
					var0.field3444 = true;
					break;
				}
			}
		}
		var0.field3446[var1] = var3;
	}
}