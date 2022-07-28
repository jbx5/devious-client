import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("of")
public abstract class class395 implements class248 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpy;")
	class433 field4441;

	class395(int var1) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-1563970648")
	abstract void vmethod7115(Buffer var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "0")
	public void method7114(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			class391 var3 = ((class391) (class271.findEnumerated(GrandExchangeOfferUnitPriceComparator.method6054(), var2)));
			if (var3 != null) {
				switch (var3.field4432) {
					case 0 :
						var1.readStringCp1252NullCircumfixed();
						break;
					case 1 :
					default :
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
					case 2 :
						int var4 = var1.readUnsignedByte();
						this.field4441 = AbstractWorldMapIcon.method5044(var4);
						if (this.field4441 != null) {
							break;
						}
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
					case 3 :
						class309[] var5 = new class309[]{ class309.field3957, class309.field3960, class309.field3961, class309.field3958 };
						class271.findEnumerated(var5, var1.readUnsignedByte());
				}
			} else {
				this.vmethod7115(var1, var2);
			}
		} 
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "951399568")
	boolean method7124() {
		return this.field4441 != null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;", garbageValue = "-1464352057")
	Object method7117() {
		if (this.field4441 == class433.field4671) {
			return 0;
		} else if (this.field4441 == class433.field4668) {
			return -1L;
		} else {
			return this.field4441 == class433.field4676 ? "" : null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lpa;I)I", garbageValue = "-764336073")
	public static final int method7113(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch (var0.field4624) {
				case 5 :
					return 20;
				default :
					return 12;
			}
		}
	}
}