import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ai")
	public static int field1059;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1661845531
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2015281063
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lor;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1007637567"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7591(var1) || this.archive.method7575(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljy;IIIIIIIII)Z",
		garbageValue = "151326930"
	)
	static final boolean method2533(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		boolean var9 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var9) {
			return false;
		} else {
			UrlRequester.method3224(var5, var6, var7, var8);
			AABB var10 = (AABB)var0.aabb.get(var1);
			int var11 = var2 + var10.xMid;
			int var12 = var3 + var10.yMid;
			int var13 = var4 + var10.zMid;
			int var14 = var10.xMidOffset;
			int var15 = var10.yMidOffset;
			int var16 = var10.zMidOffset;
			int var17 = ViewportMouse.field2892 - var11;
			int var18 = ViewportMouse.field2898 - var12;
			int var19 = ViewportMouse.field2890 - var13;
			if (Math.abs(var17) > var14 + ViewportMouse.field2896) {
				return false;
			} else if (Math.abs(var18) > var15 + class177.field1883) {
				return false;
			} else if (Math.abs(var19) > var16 + FontName.field5315) {
				return false;
			} else if (Math.abs(var19 * FaceNormal.field2750 - var18 * class425.field4765) > var16 * class177.field1883 + var15 * FontName.field5315) {
				return false;
			} else if (Math.abs(var17 * class425.field4765 - var19 * ViewportMouse.field2894) > var14 * FontName.field5315 + var16 * ViewportMouse.field2896) {
				return false;
			} else {
				return Math.abs(var18 * ViewportMouse.field2894 - var17 * FaceNormal.field2750) <= var14 * class177.field1883 + var15 * ViewportMouse.field2896;
			}
		}
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1294396496"
	)
	static void method2534() {
		Client.packetWriter.addNode(class113.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
