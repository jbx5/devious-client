import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public abstract class class426 extends class269 implements class485 {
   @ObfuscatedSignature(
      descriptor = "(Lml;Lnq;I)V"
   )
   protected class426(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Lqd;",
      garbageValue = "-1357061563"
   )
   protected abstract class428 vmethod8424(int var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "91"
   )
   public int method7938() {
      return super.field3035;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/Object;",
      garbageValue = "-118"
   )
   public Object vmethod8946(int var1) {
      class428 var2 = this.vmethod8424(var1);
      return var2 != null && var2.method7953() ? var2.method7958() : null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)Lsj;",
      garbageValue = "295942057"
   )
   public class486 method7939(Buffer var1) {
      int var2 = var1.readUnsignedShort();
      class428 var3 = this.vmethod8424(var2);
      class486 var4 = new class486(var2);
      Class var5 = var3.field4637.field4858;
      if (var5 == Integer.class) {
         var4.field4966 = var1.readInt();
      } else if (var5 == Long.class) {
         var4.field4966 = var1.readLong();
      } else if (var5 == String.class) {
         var4.field4966 = var1.readStringCp1252NullCircumfixed();
      } else {
         if (!class481.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            class481 var6 = (class481)var5.newInstance();
            var6.method8920(var1);
            var4.field4966 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }
}
