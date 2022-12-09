import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public abstract class class415 extends class262 implements class474 {
   @ObfuscatedName("tv")
   @ObfuscatedGetter(
      intValue = -1332098541
   )
   static int field4647;
   @ObfuscatedName("m")
   @Export("Interpreter_stringLocals")
   static String[] Interpreter_stringLocals;

   @ObfuscatedSignature(
      descriptor = "(Llw;Lmb;I)V"
   )
   protected class415(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lpv;",
      garbageValue = "307947551"
   )
   protected abstract class417 vmethod8354(int var1);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "50"
   )
   public int method7870() {
      return super.field3022;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "816156929"
   )
   public Object vmethod8869(int var1) {
      class417 var2 = this.vmethod8354(var1);
      return var2 != null && var2.method7893() ? var2.method7894() : null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Lrz;",
      garbageValue = "1659575774"
   )
   public class475 method7877(Buffer var1) {
      int var2 = var1.readUnsignedShort();
      class417 var3 = this.vmethod8354(var2);
      class475 var4 = new class475(var2);
      Class var5 = var3.field4651.field4875;
      if (var5 == Integer.class) {
         var4.field4981 = var1.readInt();
      } else if (var5 == Long.class) {
         var4.field4981 = var1.readLong();
      } else if (var5 == String.class) {
         var4.field4981 = var1.readStringCp1252NullCircumfixed();
      } else {
         if (!class470.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            class470 var6 = (class470)var5.newInstance();
            var6.method8838(var1);
            var4.field4981 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }
}
