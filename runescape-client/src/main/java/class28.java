import java.io.File;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class28 {
	@ObfuscatedName("f")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive15")
	static Archive archive15;
	static 
	{
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1511751941")

	static final void method390() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints == (-1)) {
				var0.delay = 0;
				class163.method3315(var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;IIIIZI)V", garbageValue = 
	"157439460")

	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}