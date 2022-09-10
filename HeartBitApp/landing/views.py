from django.shortcuts import render
from django.contrib.auth.decorators import login_required

# Create your views here.

def index(request):
    context = {"title": "Dashboard"}
    return render(request, "landing/index.html", context)
