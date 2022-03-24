import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("v")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-64")

	public static void method391() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast()));
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, ((int) (var0.key)), var0.data, false);
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lqv;", garbageValue = 
	"929937877")

	static PrivateChatMode[] method389() {
		return new PrivateChatMode[]{ PrivateChatMode.field4738, PrivateChatMode.field4739, PrivateChatMode.field4740 };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;B)V", garbageValue = 
	"8")

	public static void method390(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"([BIILgs;[Lgf;I)V", garbageValue = 
	"-1948278943")

	static final void method388(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = (var8 >> 6) & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if ((((var16 > 0) && (var17 > 0)) && (var16 < 103)) && (var17 < 103)) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}

					WorldMapIcon_1.method4556(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			} 
		} 
	}
}