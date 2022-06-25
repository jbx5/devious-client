import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.math.BigInteger;
import net.runelite.mapping.Export;
@ObfuscatedName("bs")
public class class65 {
	@ObfuscatedName("j")
	static final BigInteger field865;

	@ObfuscatedName("e")
	static final BigInteger field868;

	static {
		field865 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field868 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(descriptor = "(Lci;III)V", garbageValue = "-1780893346")
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = ScriptFrame.SequenceDefinition_get(var1).field2174;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1190 = 0;
			}
			if (var3 == 2) {
				var0.field1190 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || ScriptFrame.SequenceDefinition_get(var1).field2183 >= ScriptFrame.SequenceDefinition_get(var0.sequence).field2183) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1190 = 0;
			var0.field1203 = var0.pathLength;
		}
	}
}