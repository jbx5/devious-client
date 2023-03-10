import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class390 {
   @ObfuscatedName("ab")
   final Map field4465 = new HashMap();
   @ObfuscatedName("an")
   final Map field4468 = new HashMap();
   @ObfuscatedName("ao")
   final DecimalFormat field4469 = new DecimalFormat();

   public class390() {
      this.field4469.setMaximumFractionDigits(2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
      garbageValue = "-1545289120"
   )
   public void method7355(HttpsURLConnection var1) {
      Iterator var2 = this.field4465.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/Map;",
      garbageValue = "1"
   )
   public Map method7356() {
      return this.field4465;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-625731660"
   )
   public void method7359(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4465.put(var1, var2 != null ? var2 : "");
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1613794431"
   )
   public void method7358(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4465.remove(var1);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Loy;Ljava/lang/String;B)V",
      garbageValue = "-64"
   )
   void method7393(class389 var1, String var2) {
      String var3 = String.format("%s %s", var1.method7351(), var2);
      this.method7359("Authorization", var3);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-512273013"
   )
   public void method7360(String var1) {
      this.method7393(class389.field4463, var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1064028789"
   )
   public void method7357(String var1) {
      this.method7393(class389.field4461, var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lqn;B)V",
      garbageValue = "4"
   )
   public void method7362(class431 var1) {
      this.field4465.put("Content-Type", var1.method7965());
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-72"
   )
   public void method7363() {
      this.field4465.remove("Content-Type");
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lqn;I)V",
      garbageValue = "1731496941"
   )
   public void method7364(class431 var1) {
      this.method7367(var1, 1.0F);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lqn;FB)V",
      garbageValue = "36"
   )
   void method7367(class431 var1, float var2) {
      this.field4468.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method7366();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-5"
   )
   void method7366() {
      this.field4465.remove("Accept");
      if (!this.field4468.isEmpty()) {
         this.field4465.put("Accept", this.method7361());
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-88"
   )
   String method7361() {
      ArrayList var1 = new ArrayList(this.field4468.entrySet());
      Collections.sort(var1, new class391(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class431)var4.getKey()).method7965());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.field4469.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }
}
