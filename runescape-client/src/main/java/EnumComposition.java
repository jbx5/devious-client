import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fe")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("f")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("n")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("k")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 268659087
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -86792711
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("q")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("m")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("x")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-1787405045"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "2042214635"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "28"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "21250774"
	)
	public static int method3627(int var0) {
		return class156.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 65
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1275839888"
	)
	static float[] method3622(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 279

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 281
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 282
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 283
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 284
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 285
		} catch (JSONException var4) { // L: 287
			var2[0] = 0.0F; // L: 288
			var2[1] = 0.0F; // L: 289
			var2[2] = 1.0F; // L: 290
			var2[3] = 1.0F; // L: 291
		}

		return var2; // L: 293
	}
}
