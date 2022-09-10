import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -971404419
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1909585313
	)
	@Export("x")
	public int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1205071133
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)Z",
		garbageValue = "1896039463"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1344824322"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1396639971"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1169
			if (Client.gameState == 0) { // L: 1170
				IgnoreList.client.method493();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1171
				class142.method3196(0); // L: 1172
				Client.field525 = 0; // L: 1173
				Client.field526 = 0; // L: 1174
				Client.timer.method6704(var0); // L: 1175
				if (var0 != 20) { // L: 1176
					PacketWriter.method2673(false);
				}
			}

			if (var0 != 20 && var0 != 40 && RouteStrategy.field2237 != null) { // L: 1178 1179
				RouteStrategy.field2237.close(); // L: 1180
				RouteStrategy.field2237 = null; // L: 1181
			}

			if (Client.gameState == 25) { // L: 1184
				Client.field774 = 0; // L: 1185
				Client.field523 = 0; // L: 1186
				Client.field585 = 1; // L: 1187
				Client.field558 = 0; // L: 1188
				Client.field559 = 1; // L: 1189
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1191
				if (var0 == 20) { // L: 1195
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1196
					LoginScreenAnimation.method2375(class163.archive10, ChatChannel.archive8, false, var1); // L: 1197
				} else if (var0 == 11) { // L: 1199
					LoginScreenAnimation.method2375(class163.archive10, ChatChannel.archive8, false, 4); // L: 1200
				} else if (var0 == 50) { // L: 1202
					SecureRandomCallable.setLoginResponseString("", "Updating date of birth...", ""); // L: 1203
					LoginScreenAnimation.method2375(class163.archive10, ChatChannel.archive8, false, 7); // L: 1204
				} else {
					FriendSystem.method1836(); // L: 1206
				}
			} else {
				var1 = class344.method6492() ? 0 : 12; // L: 1192
				LoginScreenAnimation.method2375(class163.archive10, ChatChannel.archive8, true, var1); // L: 1193
			}

			Client.gameState = var0; // L: 1207
		}
	} // L: 1208
}
