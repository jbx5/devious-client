import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class1 implements Callable {
	@ObfuscatedName("ax")
	public static short[][] field6;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field3;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 136404261
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final Buffer field4;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;Lur;Lat;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field4 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod14(this.field4);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lcn;",
		garbageValue = "128"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2142505940"
	)
	static final void method7(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) {
			WorldMapLabelSize.cameraX = (var0 - WorldMapLabelSize.cameraX) * HttpResponse.field91 / 1000 + WorldMapLabelSize.cameraX + Renderable.field2716;
			if (WorldMapLabelSize.cameraX > var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (WorldMapLabelSize.cameraX > var0) {
			WorldMapLabelSize.cameraX -= (WorldMapLabelSize.cameraX - var0) * HttpResponse.field91 / 1000 + Renderable.field2716;
			if (WorldMapLabelSize.cameraX < var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (MouseHandler.cameraY < var1) {
			MouseHandler.cameraY = (var1 - MouseHandler.cameraY) * HttpResponse.field91 / 1000 + MouseHandler.cameraY + Renderable.field2716;
			if (MouseHandler.cameraY > var1) {
				MouseHandler.cameraY = var1;
			}
		}

		if (MouseHandler.cameraY > var1) {
			MouseHandler.cameraY -= (MouseHandler.cameraY - var1) * HttpResponse.field91 / 1000 + Renderable.field2716;
			if (MouseHandler.cameraY < var1) {
				MouseHandler.cameraY = var1;
			}
		}

		if (class193.cameraZ < var2) {
			class193.cameraZ = (var2 - class193.cameraZ) * HttpResponse.field91 / 1000 + class193.cameraZ + Renderable.field2716;
			if (class193.cameraZ > var2) {
				class193.cameraZ = var2;
			}
		}

		if (class193.cameraZ > var2) {
			class193.cameraZ -= (class193.cameraZ - var2) * HttpResponse.field91 / 1000 + Renderable.field2716;
			if (class193.cameraZ < var2) {
				class193.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IILiu;I)V",
		garbageValue = "-1480308235"
	)
	static final void method11(Player var0, int var1, int var2, class233 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var7 = Client.field629.method4446(var4, var5, var0.transformedSize(), class60.method1132(var1, var2), Client.collisionMaps[var0.plane], true, Client.field815, Client.field655);
				if (var7 >= 1) {
					for (int var8 = 0; var8 < var7 - 1; ++var8) {
						var0.method2344(Client.field815[var8], Client.field655[var8], var3);
					}

				}
			}
		}
	}
}
