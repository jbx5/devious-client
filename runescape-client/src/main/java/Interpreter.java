import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ar")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("as")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("az")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1754226121
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("au")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 880258881
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1049741979
	)
	static int field884;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("at")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	static boolean field893;
	@ObfuscatedName("ac")
	static boolean field894;
	@ObfuscatedName("ab")
	static ArrayList field895;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1475534203
	)
	static int field896;
	@ObfuscatedName("bd")
	static final double field890;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field893 = false;
		field894 = false;
		field895 = new ArrayList();
		field896 = 0;
		field890 = Math.log(2.0D);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1463854705"
	)
	static IndexedSprite method2107() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
		var0.subWidth = class235.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0];
		var0.palette = AbstractSocket.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		class235.SpriteBuffer_spriteWidths = null;
		SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
		AbstractSocket.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lof;IS)V",
		garbageValue = "10274"
	)
	public static void method2056(AbstractArchive var0, int var1) {
		if (!class321.field3484.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class321.field3484.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3596 = false;
				var4.field3589 = false;
				var4.field3597 = false;
				var4.field3595 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3602 = 0.0F;
				var2.add(var4);
			}

			PacketWriter.method2891(var2, class321.musicPlayerStatus, class321.field3476, class321.field3485, class321.field3486, false);
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-129271426"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field737.method4394();
			}

			if (Client.gameState == 0) {
				class193.client.method571();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class407.updateLoginState(LoginState.field519);
				Client.field559 = 0;
				Client.field560 = 0;
				Client.timer.method8108(var0);
				if (var0 != 20) {
					ScriptEvent.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class324.field3539 != null) {
				class324.field3539.close();
				class324.field3539 = null;
			}

			if (Client.gameState == 25) {
				Client.field598 = 0;
				Client.field594 = 0;
				Client.field666 = 1;
				Client.field621 = 0;
				Client.field597 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					class344.method6458(ScriptFrame.archive10, class311.archive8, false, var3);
				} else if (var0 == 11) {
					class344.method6458(ScriptFrame.archive10, class311.archive8, false, 4);
				} else if (var0 == 50) {
					SecureUrlRequester.setLoginResponseString("", "Updating date of birth...", "");
					class344.method6458(ScriptFrame.archive10, class311.archive8, false, 7);
				} else if (var0 != 0) {
					WorldMapDecoration.method5034();
				}
			} else {
				boolean var1 = class30.clientPreferences.method2539() >= Client.field688;
				int var2 = var1 ? 0 : 12;
				class344.method6458(ScriptFrame.archive10, class311.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
