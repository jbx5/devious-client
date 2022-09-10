import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2058756479
	)
	@Export("id")
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1235807207
	)
	@Export("count")
	int count;
	@ObfuscatedName("q")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("m")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	class202 field2406;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2406 = new class202(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	public int method4248() {
		return this.count; // L: 38
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lge;",
		garbageValue = "-563636318"
	)
	public class202 method4249() {
		return this.field2406; // L: 42
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "125"
	)
	static void method4247(int var0) {
		class388.field4430 = var0; // L: 22
		class388.field4429 = new class388[var0]; // L: 23
		class388.field4434 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1163435315"
	)
	static boolean method4257() {
		Date var0;
		try {
			SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1023
			var2.setLenient(false); // L: 1024
			StringBuilder var3 = new StringBuilder(); // L: 1025
			String[] var4 = Login.field907; // L: 1027
			int var5 = 0;

			while (true) {
				Date var1;
				if (var5 < var4.length) {
					String var6 = var4[var5]; // L: 1029
					if (var6 != null) { // L: 1031
						var3.append(var6); // L: 1039
						++var5; // L: 1028
						continue;
					}

					class139.method3101(7); // L: 1033
					SecureRandomCallable.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1034
					var1 = null; // L: 1036
				} else {
					var3.append("12"); // L: 1043
					var1 = var2.parse(var3.toString()); // L: 1044
				}

				var0 = var1; // L: 1046
				break;
			}
		} catch (ParseException var10) { // L: 1048
			class139.method3101(7); // L: 1050
			SecureRandomCallable.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1051
			return false; // L: 1053
		}

		if (var0 == null) { // L: 1055
			return false; // L: 1056
		} else {
			java.util.Calendar var11 = java.util.Calendar.getInstance(); // L: 1060
			var11.set(1, var11.get(1) - 13); // L: 1061
			var11.set(5, var11.get(5) + 1); // L: 1062
			var11.set(11, 0); // L: 1063
			var11.set(12, 0); // L: 1064
			var11.set(13, 0); // L: 1065
			var11.set(14, 0); // L: 1066
			Date var12 = var11.getTime(); // L: 1067
			boolean var7 = var0.before(var12); // L: 1068
			boolean var9 = class6.method50(var0); // L: 1071
			if (!var9) { // L: 1072
				class139.method3101(7); // L: 1074
				SecureRandomCallable.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1075
				return false; // L: 1077
			} else {
				if (!var7) { // L: 1079
					MusicPatchNode2.field3223 = 8388607; // L: 1080
				} else {
					MusicPatchNode2.field3223 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1083
				}

				return true; // L: 1085
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1356698053"
	)
	public static int method4255(CharSequence var0) {
		int var1 = var0.length(); // L: 139
		int var2 = 0; // L: 140

		for (int var3 = 0; var3 < var1; ++var3) { // L: 141
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 142
	}
}
