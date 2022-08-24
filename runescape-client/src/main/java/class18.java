import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.Comparator;
import java.util.Map.Entry;
@ObfuscatedName("p")
class class18 implements Comparator {
	@ObfuscatedName("tb")
	@ObfuscatedGetter(intValue = -389618459)
	static int field96;

	@ObfuscatedSignature(descriptor = "Ld;")
	final class10 this$0;

	@ObfuscatedSignature(descriptor = "(Ld;)V")
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I", garbageValue = "-1460972605")
	int method253(Entry var1, Entry var2) {
		return ((Float) (var2.getValue())).compareTo(((Float) (var1.getValue())));
	}

	public int compare(Object var1, Object var2) {
		return this.method253(((Entry) (var1)), ((Entry) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(ILku;ZI)V", garbageValue = "1859410588")
	static void method264(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class65.getWorldMap().getMapArea(var0);
		int var4 = ScriptFrame.localPlayer.plane;
		int var5 = Decimator.baseX * 8 + (ScriptFrame.localPlayer.x >> 7);
		int var6 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		class65.getWorldMap().method7279(var3, var7, var1, var2);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(descriptor = "(Lkn;I)Z", garbageValue = "-2080011839")
	static final boolean method263(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}
			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5497(var2, var3 == 1);
			}
			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}
			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}
			if (var1 == 326) {
				PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}