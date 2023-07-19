import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class89 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1097(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1096(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1091(2, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1093(3, 8),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1089(4, 9);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static ClanChannel field1092;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -893078041
	)
	final int field1094;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -961494479
	)
	final int field1095;

	class89(int var3, int var4) {
		this.field1094 = var3;
		this.field1095 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1095;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	static final void method2306(int var0, int var1, int var2) {
		if (class157.cameraX < var0) {
			class157.cameraX = (var0 - class157.cameraX) * SecureRandomFuture.field990 / 1000 + class157.cameraX + Client.field755;
			if (class157.cameraX > var0) {
				class157.cameraX = var0;
			}
		}

		if (class157.cameraX > var0) {
			class157.cameraX -= (class157.cameraX - var0) * SecureRandomFuture.field990 / 1000 + Client.field755;
			if (class157.cameraX < var0) {
				class157.cameraX = var0;
			}
		}

		if (class384.cameraY < var1) {
			class384.cameraY = (var1 - class384.cameraY) * SecureRandomFuture.field990 / 1000 + class384.cameraY + Client.field755;
			if (class384.cameraY > var1) {
				class384.cameraY = var1;
			}
		}

		if (class384.cameraY > var1) {
			class384.cameraY -= (class384.cameraY - var1) * SecureRandomFuture.field990 / 1000 + Client.field755;
			if (class384.cameraY < var1) {
				class384.cameraY = var1;
			}
		}

		if (SoundSystem.cameraZ < var2) {
			SoundSystem.cameraZ = (var2 - SoundSystem.cameraZ) * SecureRandomFuture.field990 / 1000 + SoundSystem.cameraZ + Client.field755;
			if (SoundSystem.cameraZ > var2) {
				SoundSystem.cameraZ = var2;
			}
		}

		if (SoundSystem.cameraZ > var2) {
			SoundSystem.cameraZ -= (SoundSystem.cameraZ - var2) * SecureRandomFuture.field990 / 1000 + Client.field755;
			if (SoundSystem.cameraZ < var2) {
				SoundSystem.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2092495072"
	)
	static void method2308() {
		if (Client.field766) {
			GrandExchangeOfferNameComparator.addPlayerToScene(class136.localPlayer, false);
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1018323278"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
