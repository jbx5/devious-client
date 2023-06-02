import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public abstract class class443 extends class280 implements class508 {
   @ObfuscatedName("cv")
   static String field4710;

   @ObfuscatedSignature(
      descriptor = "(Lng;Loj;I)V"
   )
   protected class443(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lrg;",
      garbageValue = "-1481275551"
   )
   protected abstract class445 vmethod8719(int var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1727561209"
   )
   public int method8195() {
      return super.field3065;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/Object;",
      garbageValue = "-44"
   )
   public Object vmethod9238(int var1) {
      class445 var2 = this.vmethod8719(var1);
      return var2 != null && var2.method8213() ? var2.method8214() : null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)Lts;",
      garbageValue = "-54"
   )
   public class509 method8197(Buffer var1) {
      int var2 = var1.readUnsignedShort();
      class445 var3 = this.vmethod8719(var2);
      class509 var4 = new class509(var2);
      Class var5 = var3.field4714.field4974;
      if (var5 == Integer.class) {
         var4.field5083 = var1.readInt();
      } else if (var5 == Long.class) {
         var4.field5083 = var1.readLong();
      } else if (var5 == String.class) {
         var4.field5083 = var1.readStringCp1252NullCircumfixed();
      } else {
         if (!class504.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            class504 var6 = (class504)var5.newInstance();
            var6.method9204(var1);
            var4.field5083 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }
}
