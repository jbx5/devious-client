import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class145 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -961187179
	)
	int field1664;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1586708675
	)
	int field1659;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 12512513
	)
	int field1660;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1495921399
	)
	int field1661;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class145(class151 var1) {
		this.this$0 = var1;
		this.field1664 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1664 = var1.readUnsignedShort();
		this.field1659 = var1.readInt();
		this.field1660 = var1.readUnsignedByte();
		this.field1661 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3464(this.field1664, this.field1659, this.field1660, this.field1661);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Loz;",
		garbageValue = "54"
	)
	static GameBuild[] method3323() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE};
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1429450986"
	)
	static void method3322(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class328.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}
}
