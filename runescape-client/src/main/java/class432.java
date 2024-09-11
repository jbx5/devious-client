import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class432 implements Iterator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class433 field4762;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1046922763
	)
	int field4763;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1036950179
	)
	int field4761;

	@ObfuscatedSignature(
		descriptor = "(Lqg;)V"
	)
	class432(class433 var1) {
		this.field4763 = 0;
		this.field4761 = this.field4762.field4768;
		this.field4762 = var1;
	}

	public boolean hasNext() {
		return this.field4763 < this.field4762.field4767;
	}

	public Object next() {
		if (this.field4762.field4768 != this.field4761) {
			throw new ConcurrentModificationException();
		} else if (this.field4763 < this.field4762.field4767) {
			Object var1 = this.field4762.field4770[this.field4763].field4758;
			++this.field4763;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "1386612827"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
