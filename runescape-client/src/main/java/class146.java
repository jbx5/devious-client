import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class146 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1690(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1681(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1682(2, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1692(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1684(4, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1685(5, 5),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1683(6, 6),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1687(7, 7),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1688(8, 8);

	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1837970759
	)
	static int field1680;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1797653987
	)
	final int field1689;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 64151861
	)
	final int field1691;

	class146(int var3, int var4) {
		this.field1689 = var3;
		this.field1691 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1691;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1853455341"
	)
	static boolean method3430() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
			var2.setLenient(false);
			StringBuilder var3 = new StringBuilder();
			String[] var4 = Login.field970;
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5];
					if (var6 != null) {
						var3.append(var6);
						++var5;
						continue;
					}

					LoginState.updateLoginIndex(7);
					Login.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
					var1 = null;
				} else {
					var3.append("12");
					var1 = var2.parse(var3.toString());
				}

				var0 = var1;
				break;
			}
		} catch (ParseException var10) {
			LoginState.updateLoginIndex(7);
			Login.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var7 = VerticalAlignment.method4020(var0);
			Date var11 = class281.method5749();
			boolean var8 = var0.after(var11);
			if (!var8) {
				LoginState.updateLoginIndex(7);
				Login.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var7) {
					Script.field1037 = 8388607;
				} else {
					Script.field1037 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1227018075"
	)
	static final void method3428() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.npcCount; ++var2) {
				int var3 = var1.npcIndices[var2];
				NPC var4 = var1.npcs[var3];
				if (var4 != null) {
					class425.updateActorSequence(var1, var4, var4.definition.size);
				}
			}
		}

	}
}
