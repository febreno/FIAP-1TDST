{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 3,
   "id": "9e8cf7ab",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Terminou\n"
     ]
    }
   ],
   "source": [
    "import Imagem\n",
    "\n",
    "matrizes = Imagem.getMatrizImagemColorida('lago_canada.jpg')\n",
    "\n",
    "matrizR = matrizes[0]\n",
    "matrizG = matrizes[1]\n",
    "matrizB = matrizes[2]\n",
    "\n",
    "for i in range(len(matrizR) // 3):\n",
    "    for j in range(len(matrizR[0])):\n",
    "        matrizR[i][j] = matrizR[i][j] + 50\n",
    "        matrizG[i][j] = matrizG[i][j] + 50\n",
    "        matrizB[i][j] = matrizB[i][j] + 50\n",
    "        \n",
    "Imagem.salvaImagemColorida('lago_canada_claro2.jpg', matrizR, matrizG, matrizB)        \n",
    "print(\"Terminou\")"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "e3437493",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.9.12"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
