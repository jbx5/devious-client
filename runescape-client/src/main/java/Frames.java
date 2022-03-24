import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("q")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lgi;")

	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;IZ)V")

	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = ((var9[0] & 255) << 8) | (var9[1] & 255);

			for (Skeleton var12 = ((Skeleton) (var5.last())); var12 != null; var12 = ((Skeleton) (var5.previous()))) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0);
				}

				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-2054162856")

	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(FFFF[FB)V", garbageValue = 
	"1")

	static void method4316(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4[3] = (var7 - var6) - var8;
		var4[2] = (var8 + var8) + var8;
		var4[1] = (var5 + var5) + var5;
		var4[0] = var0;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I)Z", garbageValue = 
	"-1456881202")

	static final boolean method4319(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5610(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}