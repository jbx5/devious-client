import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class94 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1167;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1166;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1170;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1181;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1173;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1183;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1171;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1172;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1165;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1174;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1175;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1176;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1177;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1178;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1179;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1169;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1180;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class94 field1182;

	static {
		field1167 = new class94();
		field1166 = new class94();
		field1170 = new class94();
		field1181 = new class94();
		field1173 = new class94();
		field1183 = new class94();
		field1171 = new class94();
		field1172 = new class94();
		field1165 = new class94();
		field1174 = new class94();
		field1175 = new class94();
		field1176 = new class94();
		field1177 = new class94();
		field1178 = new class94();
		field1179 = new class94();
		field1169 = new class94();
		field1180 = new class94();
		field1182 = new class94();
	}

	class94() {
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(IIIILvc;Lnw;I)V",
		garbageValue = "206054039"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10150(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	static final void method2409() {
		for (int var0 = 0; var0 < class358.scene.field1336.field1415; ++var0) {
			Player var1 = class358.scene.field1341[class358.scene.field1336.field1416[var0]];
			var1.clearIsFriend();
		}

		Iterator var2 = Messages.Messages_hashTable.iterator();

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next();
			var3.clearIsFromFriend();
		}

		if (class108.friendsChat != null) {
			class108.friendsChat.clearFriends();
		}

	}
}
