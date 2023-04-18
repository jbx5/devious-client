import java.awt.Component;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class394 {
   @ObfuscatedName("al")
   @Export("SpriteBuffer_spritePalette")
   public static int[] SpriteBuffer_spritePalette;
   @ObfuscatedName("ac")
   final Map field4521 = new HashMap();
   @ObfuscatedName("au")
   final Map field4525 = new HashMap();
   @ObfuscatedName("ab")
   final DecimalFormat field4526 = new DecimalFormat();

   public class394() {
      this.field4526.setMaximumFractionDigits(2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
      garbageValue = "1759614769"
   )
   public void method7625(HttpsURLConnection var1) {
      Iterator var2 = this.field4521.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Map;",
      garbageValue = "1411572394"
   )
   public Map method7626() {
      return this.field4521;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-687653151"
   )
   public void method7627(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4521.put(var1, var2 != null ? var2 : "");
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "-14811"
   )
   public void method7657(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4521.remove(var1);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lpm;Ljava/lang/String;B)V",
      garbageValue = "84"
   )
   void method7629(class393 var1, String var2) {
      String var3 = String.format("%s %s", var1.method7621(), var2);
      this.method7627("Authorization", var3);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "95"
   )
   public void method7645(String var1) {
      this.method7629(class393.field4519, var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-596088088"
   )
   public void method7631(String var1) {
      this.method7629(class393.field4518, var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lqz;I)V",
      garbageValue = "1037521942"
   )
   public void method7632(class435 var1) {
      this.field4521.put("Content-Type", var1.method8319());
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1055361805"
   )
   public void method7633() {
      this.field4521.remove("Content-Type");
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lqz;B)V",
      garbageValue = "49"
   )
   public void method7634(class435 var1) {
      this.method7635(var1, 1.0F);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lqz;FI)V",
      garbageValue = "-868305920"
   )
   void method7635(class435 var1, float var2) {
      this.field4525.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method7636();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "720033407"
   )
   void method7636() {
      this.field4521.remove("Accept");
      if (!this.field4525.isEmpty()) {
         this.field4521.put("Accept", this.method7665());
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "269746303"
   )
   String method7665() {
      ArrayList var1 = new ArrayList(this.field4525.entrySet());
      Collections.sort(var1, new class395(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class435)var4.getKey()).method8319());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.field4526.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "1714263236"
   )
   static void method7672(Component var0) {
      var0.addMouseListener(MouseHandler.MouseHandler_instance);
      var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.addFocusListener(MouseHandler.MouseHandler_instance);
   }
}
