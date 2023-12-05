import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public abstract class class469 implements class291 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	class514 field4808;

	class469(int var1) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-1867165172"
	)
	abstract void vmethod8552(Buffer var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "0"
	)
	public void method8551(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class465 var3 = (class465)class12.findEnumerated(class129.method3090(), var2);
			if (var3 != null) {
				switch(var3.field4791) {
				case 0:
					class12.findEnumerated(MilliClock.method4243(), var1.readUnsignedByte());
					break;
				case 1:
					int var4 = var1.readUnsignedByte();
					this.field4808 = HttpContentType.method8562(var4);
					if (this.field4808 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod8552(var1, var2);
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "984690534"
	)
	boolean method8553() {
		return this.field4808 != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1989421795"
	)
	Object method8554() {
		if (this.field4808 == class514.field5065) {
			return 0;
		} else if (this.field4808 == class514.field5066) {
			return -1L;
		} else {
			return this.field4808 == class514.field5061 ? "" : null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ltf;",
		garbageValue = "1997766495"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5085.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9176(new Buffer(var2));
			}

			var1.method9165();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
