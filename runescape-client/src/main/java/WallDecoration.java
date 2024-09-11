import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1674495999
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1739114137
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1988077953
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1744270061
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1905786199
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1050358309
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 640285173
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -4784704960526427281L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1357024307
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lux;I)Ljava/lang/Object;",
		garbageValue = "-1960008918"
	)
	static Object method5536(class537 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5330) {
			case 1:
				return Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "954419119"
	)
	static final void method5537() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = var1.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.clearIsFriend();
				}
			}
		}

		var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var4 = (Message)var0.next();
			var4.clearIsFromFriend();
		}

		if (class168.friendsChat != null) {
			class168.friendsChat.clearFriends();
		}

	}
}
