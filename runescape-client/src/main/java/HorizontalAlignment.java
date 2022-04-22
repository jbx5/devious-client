import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fw")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lfw;")

	field1889(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lfw;")

	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lfw;")

	field1890(0, 2);

	@ObfuscatedName("px")
	@ObfuscatedSignature(descriptor = 
	"Loa;")

	static class391 field1885;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	544424349)

	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-801699883)

	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqq;", garbageValue = 
	"2022945893")

	public static IndexedSprite method3492() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class451.SpriteBuffer_spriteWidth;
		var0.height = class451.SpriteBuffer_spriteHeight;
		var0.xOffset = class451.SpriteBuffer_xOffsets[0];
		var0.yOffset = class271.SpriteBuffer_yOffsets[0];
		var0.subWidth = class451.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class451.SpriteBuffer_spriteHeights[0];
		var0.palette = NetFileRequest.SpriteBuffer_spritePalette;
		var0.pixels = FriendLoginUpdate.SpriteBuffer_pixels[0];
		ArchiveDiskActionHandler.method5813();
		return var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONObject;Ljava/lang/String;B)[F", garbageValue = 
	"-127")

	static float[] method3495(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = ((float) (var3.optDouble(0, 0.0)));
			var2[1] = ((float) (var3.optDouble(1, 0.0)));
			var2[2] = ((float) (var3.optDouble(2, 1.0)));
			var2[3] = ((float) (var3.optDouble(3, 1.0)));
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}}