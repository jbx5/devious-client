import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1212274935)

	static int field1354;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;I)I", garbageValue = 
	"-2106279349")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if ((var1.world != 0) && (var2.world != 0)) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/awt/Component;B)V", garbageValue = 
	"2")

	static void method2584(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("h")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if ((var0 > 0L) && (var0 < 6582952005840035281L)) {
			if (0L == (var0 % 37L)) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class349.base37Table[((int) (var6 - (var0 * 37L)))];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1287758348")

	static final void method2577() {
		if (class345.ClanChat_inClanChat) {
			if (class230.friendsChat != null) {
				class230.friendsChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInFriendsChat();
			}

			class345.ClanChat_inClanChat = false;
		}

	}
}