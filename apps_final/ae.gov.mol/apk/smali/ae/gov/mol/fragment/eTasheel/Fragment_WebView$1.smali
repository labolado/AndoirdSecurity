.class Lae/gov/mol/fragment/eTasheel/Fragment_WebView$1;
.super Ljava/lang/Object;
.source "Fragment_WebView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lae/gov/mol/fragment/eTasheel/Fragment_WebView;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lae/gov/mol/fragment/eTasheel/Fragment_WebView;


# direct methods
.method constructor <init>(Lae/gov/mol/fragment/eTasheel/Fragment_WebView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lae/gov/mol/fragment/eTasheel/Fragment_WebView$1;->this$0:Lae/gov/mol/fragment/eTasheel/Fragment_WebView;

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "arg0"    # Landroid/view/View;

    .prologue
    .line 56
    iget-object v0, p0, Lae/gov/mol/fragment/eTasheel/Fragment_WebView$1;->this$0:Lae/gov/mol/fragment/eTasheel/Fragment_WebView;

    # getter for: Lae/gov/mol/fragment/eTasheel/Fragment_WebView;->mCustomFragmentActivity:Lae/gov/mol/helper/CustomFragmentActivity;
    invoke-static {v0}, Lae/gov/mol/fragment/eTasheel/Fragment_WebView;->access$0(Lae/gov/mol/fragment/eTasheel/Fragment_WebView;)Lae/gov/mol/helper/CustomFragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Lae/gov/mol/helper/CustomFragmentActivity;->removeBack()V

    .line 57
    return-void
.end method
