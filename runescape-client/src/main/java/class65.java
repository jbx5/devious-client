import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class65 {
	@ObfuscatedName("b")
	static final BigInteger field863;
	@ObfuscatedName("n")
	static final BigInteger field864;
	@ObfuscatedName("bx")
	static String field868;
	static 
	{
		field863 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field864 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(descriptor = 
	"(Lky;Lgf;IIZI)V", garbageValue = 
	"1206801353")

	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if ((var5 != null) && (var5[var3] != null)) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if ((var6 != (-1)) && (var7 != null)) {
			class28.insertMenuItem(var7, UserComparator9.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}