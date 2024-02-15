import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class7 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1342537435
	)
	static int field21;
	@ObfuscatedName("aq")
	ExecutorService field18;
	@ObfuscatedName("aw")
	Future field13;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	final Buffer field15;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field16;

	@ObfuscatedSignature(
		descriptor = "(Luq;Lai;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field18 = Executors.newSingleThreadExecutor();
		this.field15 = var1;
		this.field16 = var2;
		this.method43();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "385185200"
	)
	public boolean method40() {
		return this.field13.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	public void method41() {
		this.field18.shutdown();
		this.field18 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "-1961365501"
	)
	public Buffer method42() {
		try {
			return (Buffer)this.field13.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "764307874"
	)
	void method43() {
		this.field13 = this.field18.submit(new class1(this, this.field15, this.field16));
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "393503738"
	)
	static void method39(int var0, int var1) {
		if (class30.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(WorldMapSectionType.field2612, var0, 0, class30.clientPreferences.getMusicVolume(), false));
			PacketWriter.method2891(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1011099662"
	)
	static final void method53(int var0, int var1, int var2) {
		if (ClanMate.cameraX < var0) {
			ClanMate.cameraX = (var0 - ClanMate.cameraX) * GameBuild.field3978 / 1000 + ClanMate.cameraX + class516.field5118;
			if (ClanMate.cameraX > var0) {
				ClanMate.cameraX = var0;
			}
		}

		if (ClanMate.cameraX > var0) {
			ClanMate.cameraX -= (ClanMate.cameraX - var0) * GameBuild.field3978 / 1000 + class516.field5118;
			if (ClanMate.cameraX < var0) {
				ClanMate.cameraX = var0;
			}
		}

		if (AsyncHttpResponse.cameraY < var1) {
			AsyncHttpResponse.cameraY = (var1 - AsyncHttpResponse.cameraY) * GameBuild.field3978 / 1000 + AsyncHttpResponse.cameraY + class516.field5118;
			if (AsyncHttpResponse.cameraY > var1) {
				AsyncHttpResponse.cameraY = var1;
			}
		}

		if (AsyncHttpResponse.cameraY > var1) {
			AsyncHttpResponse.cameraY -= (AsyncHttpResponse.cameraY - var1) * GameBuild.field3978 / 1000 + class516.field5118;
			if (AsyncHttpResponse.cameraY < var1) {
				AsyncHttpResponse.cameraY = var1;
			}
		}

		if (class317.cameraZ < var2) {
			class317.cameraZ = (var2 - class317.cameraZ) * GameBuild.field3978 / 1000 + class317.cameraZ + class516.field5118;
			if (class317.cameraZ > var2) {
				class317.cameraZ = var2;
			}
		}

		if (class317.cameraZ > var2) {
			class317.cameraZ -= (class317.cameraZ - var2) * GameBuild.field3978 / 1000 + class516.field5118;
			if (class317.cameraZ < var2) {
				class317.cameraZ = var2;
			}
		}

	}
}
