import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mu")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1400406739
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1887252523
	)
	@Export("x")
	public int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1320399219
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1987499924"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)Z",
		garbageValue = "-636539751"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "963757583"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public String toString() {
		return this.toString(",");
	}

	public int hashCode() {
		return this.packed();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-49"
	)
	static int method6328(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1107071465"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			Actor.method2488(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class319.field3466.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class319.field3466.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && class93.clientPreferences.getMusicVolume() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(WorldMapSection0.archive6, var0, 0, class93.clientPreferences.getMusicVolume(), false));
				if (Client.playingJingle) {
					class319.field3466.clear();
					class319.field3466.addAll(var3);
					WorldMapRectangle.method5019(0, 100, 100, 0);
				} else {
					LoginScreenAnimation.method2528(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-1042992560"
	)
	static final boolean method6334(Widget var0) {
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
				Client.playerAppearance.method6388(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6386(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6386(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-11"
	)
	static void method6339(String var0) {
		class426.field4608 = var0;

		try {
			String var1 = VertexNormal.client.getParameter(Integer.toString(18));
			String var2 = VertexNormal.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + KitDefinition.method3654(UserComparator9.method2973() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class26.method390(VertexNormal.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
