import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("od")
public abstract class class395 implements class248 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpk;")
	class433 field4434;

	class395(int var1) {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;IS)V", garbageValue = "4362")
	abstract void vmethod7027(Buffer var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "2109027949")
	public void method7031(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			class391 var3 = ((class391) (GameEngine.findEnumerated(Projectile.method1926(), var2)));
			if (var3 != null) {
				switch (var3.field4424) {
					case 0 :
						int var4 = var1.readUnsignedByte();
						this.field4434 = class19.method285(var4);
						if (this.field4434 != null) {
							break;
						}
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
					case 1 :
						var1.readStringCp1252NullCircumfixed();
						break;
					case 2 :
						class309[] var5 = new class309[]{ class309.field3945, class309.field3938, class309.field3941, class309.field3940 };
						GameEngine.findEnumerated(var5, var1.readUnsignedByte());
						break;
					default :
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod7027(var1, var2);
			}
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
	boolean method7026() {
		return this.field4434 != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/Object;", garbageValue = "0")
	Object method7029() {
		if (this.field4434 == class433.field4659) {
			return 0;
		} else if (this.field4434 == class433.field4653) {
			return -1L;
		} else {
			return this.field4434 == class433.field4655 ? "" : null;
		}
	}
}