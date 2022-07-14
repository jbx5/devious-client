import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nh")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 105823237)
	public int field4300;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqa;")
	@Export("username")
	public Username username;

	@ObfuscatedName("q")
	@Export("world")
	public short world;

	@ObfuscatedSignature(descriptor = "(Lqa;I)V")
	FriendLoginUpdate(Username var1, int var2) {
		this.field4300 = ((int) (class115.method2692() / 1000L));
		this.username = var1;
		this.world = ((short) (var2));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Lpx;", garbageValue = "-1096065009")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = ((DbRowType) (DbRowType.DBRowType_cache.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field4675.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method7635(new Buffer(var2));
			}
			var1.method7636();
			DbRowType.DBRowType_cache.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-1")
	static final void method6632(String var0) {
		StringBuilder var10000 = new StringBuilder().append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		class290.addGameMessage(30, "", var1);
	}
}